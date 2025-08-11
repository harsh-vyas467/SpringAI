package com.harsh.SpringAICode;


import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    private OpenAiChatModel chatModelel;

    public OpenAIController(OpenAiChatModel chatModel){
        this.chatModelel = chatModel;
    }

    @GetMapping("/api/{prompt}")
    public String getAnswer(@PathVariable String prompt){

        String response = chatModelel.call(prompt);
        return response;
    }
}
