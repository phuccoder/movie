package io.movie.project.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import io.movie.project.domain.Type;

import java.io.IOException;


public class TypeSerialize extends JsonSerializer<Type> {

    @Override
    public void serialize(Type value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getName());
    }
}
