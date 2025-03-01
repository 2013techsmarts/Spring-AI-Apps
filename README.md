# Spring-AI-Apps

This repository contains applications created using **Spring AI**.

## Instructions to Set Up the Travel-Planner Application

1. **Obtain an OpenAI API Key**  
   - Visit [OpenAI's Platform](https://platform.openai.com/docs/overview) to generate your API key.

2. **Set Up Environment Variables**  
   - Add the following environment variable when launching the Spring Boot application:  
     ```bash
     SPRING_AI_OPENAI_API_KEY=<Your_OpenAI_Key>
     ```

3. **Access the Travel-Planner API**  
   - Use the `/travel-planner` endpoint with your desired prompt to interact with the application.  
   - Example:  
     ```bash
     curl -X POST http://localhost:8080/travel-planner -d '{"prompt": "I want to travel with my family of 4 to Newyork for a 3 DAY trip. I am travelling from Washington D.C. Please provide itenery for this trip along with hotel and air fare"}'
     ```

Enjoy building and experimenting with the Travel-Planner application!

