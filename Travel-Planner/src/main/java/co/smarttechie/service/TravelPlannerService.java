package co.smarttechie.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class TravelPlannerService {

    private final ChatModel chatModel;

    public TravelPlannerService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getResponse(String prompt) {

        return ChatClient.create(chatModel)
                .prompt(prompt)
                .tools(new TravelPlannerTools())
                .call()
                .content();

    }
}
