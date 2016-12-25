package com.matthewdiana.verifyvanity.checkers;

import java.io.IOException;

/**
 * Created by matt on 12/24/16.
 */
public interface StateChecker {

    boolean isValid();

    boolean isAvailable() throws IOException;

}
