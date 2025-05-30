package com.dto.rawRequest.rawRequestValidator;

import com.dto.payload.Payload;
import com.dto.rawRequest.RawRequest;


/**
 * @param <X>
 * @param <Y>
 * @author udaya
 */
public interface RawRequestValidator<X extends RawRequest, Y extends Payload> {

    Y validate(X rawRequest);
}
