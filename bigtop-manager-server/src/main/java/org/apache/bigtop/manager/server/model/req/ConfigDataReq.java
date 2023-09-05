package org.apache.bigtop.manager.server.model.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

@Data
public class ConfigDataReq {

    @Schema(example = "zoo.cfg", requiredMode = Schema.RequiredMode.REQUIRED)
    private String typeName;

    @Schema(example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "如果进行回滚操作，需要指定版本号")
    private String version;

    @Schema(example = "{\"clientPort\": \"2181\"}")
    private Map<String, Object> configData;

    @Schema(example = "{\"number\": {\"clientPort\": true}}")
    private Map<String, Map<String, Object>> configAttributes;
}
