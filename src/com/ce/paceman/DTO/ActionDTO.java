package com.ce.paceman.DTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ActionDTO {

    GameStateDTO gameStateDTO;

    static  ObjectMapper mapper = new ObjectMapper();//Para poder hacer operaciones JSON
    public ActionDTO() {
        this.gameStateDTO = new GameStateDTO();
    }

    int type;

    public GameStateDTO getGameStateDTO() {
        return gameStateDTO;
    }

    public void setGameStateDTO(GameStateDTO gameStateDTO) {
        this.gameStateDTO = gameStateDTO;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public String serialize() {

        try {
            //Pasando de objeto a string en formato json
            String jsonInString = mapper.writeValueAsString(this);
            System.out.println(jsonInString);        //aquí se ve impreso, es lo que eventualmente se envia.
            return jsonInString;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
