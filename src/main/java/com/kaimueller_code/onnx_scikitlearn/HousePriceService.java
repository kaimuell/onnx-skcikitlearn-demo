package com.kaimueller_code.onnx_scikitlearn;

import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtSession;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class HousePriceService {

    private final OrtEnvironment env;
    private final OrtSession session;

    HousePriceService() throws OrtException, IOException {
        //Load Model for californian House Prices
        String modelFilePath = new ClassPathResource("static/house_prices.onnx").getFile().getPath();
        this.env = OrtEnvironment.getEnvironment();
        this.session = env.createSession(modelFilePath);
    }

    public float inferHousePrice(House house) throws OrtException {
        Map<String, OnnxTensor> input = house.toTensorMap(env);
        OrtSession.Result result = session.run(input);
        float inferedHousePrice = ((float[][]) result.get("variable").get().getValue())[0][0];
        return inferedHousePrice;
    }

}
