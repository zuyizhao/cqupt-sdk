package com.github.juzi214032.cqupt.sdk.oa.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 信息文件
 *
 * @author Juzi - https://juzibiji.top
 * @since 2020/1/11 13:32
 */
@Data
@Accessors(chain = true)
public class OaInformationFile implements Serializable {
    private static final long serialVersionUID = -2851282126938209891L;
    /**
     * 文件名
     */
    private String fileName;

    /**
     * 通知id
     */
    private String informationId;

    /**
     * 文件id
     */
    private String fileId;
}
