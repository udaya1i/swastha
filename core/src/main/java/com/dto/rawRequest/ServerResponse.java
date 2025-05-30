package com.dto.rawRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServerResponse {

    private String message;
    private HttpStatus status;
    private Object data;

    public static class ServerResponseBuilder {
        private String message;
        private HttpStatus status;
        private Object data;

        public ServerResponseBuilder setMessage(String message) {
            this.message = message;
            return this;
        }

        public ServerResponseBuilder setStatus(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ServerResponseBuilder setData(Object data) {
            this.data = data;
            return this;
        }

        public ServerResponse build() {
            return new ServerResponse(message, status, data);
        }
    }

    public static ServerResponseBuilder builder() {
        return new ServerResponseBuilder();
    }

}
