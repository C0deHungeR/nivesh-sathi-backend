package com.hackathon.NiveshSathi.controller;

import com.hackathon.NiveshSathi.dto.MlRequest;
import com.hackathon.NiveshSathi.dto.RecommendationResponse;
import com.hackathon.NiveshSathi.service.MlService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class AIRecommendationController {

    private final MlService mlService;

    @PostMapping("/recommend")
    public ResponseEntity<RecommendationResponse> recommend(
            @RequestBody MlRequest mlRequest
    ) {
        // Directly forward ML-shaped request to FastAPI
        RecommendationResponse response = mlService.getRecommendation(mlRequest);
        return ResponseEntity.ok(response);
    }
}
