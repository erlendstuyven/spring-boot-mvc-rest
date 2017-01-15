package be.waitinglist.login.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UncheckedObjectMapper extends ObjectMapper{

    @Override
    public String writeValueAsString(Object value) throws JsonProcessingException {
        super.writeValueAsString(value);
        this.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String loginMessage = null;
        try {
            loginMessage = objectMapper.writeValueAsString(login);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
