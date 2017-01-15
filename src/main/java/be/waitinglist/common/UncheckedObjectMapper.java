package be.waitinglist.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.UncheckedIOException;

public class UncheckedObjectMapper extends ObjectMapper{

    @Override
    public String writeValueAsString(Object value)  {
        try {
            return super.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new UncheckedIOException(e);
        }
    }
}
