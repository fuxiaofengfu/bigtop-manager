package org.apache.bigtop.manager.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Command {

    INSTALL,

    UNINSTALL,

    START,

    STOP,

    STATUS,

    RESTART,

    CONFIGURE,

    CHECK,

    CUSTOM_COMMAND,
    ;

    @JsonCreator
    public static Command fromString(String value) {
        return Command.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String toLowerCase() {
        return name().toLowerCase();
    }
}
