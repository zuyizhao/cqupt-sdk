package com.github.juzi214032.cqupt.sdk.volunteer.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 项目
 *
 * @author Juzi - https://juzibiji.top
 * @since 2019/8/9 18:25
 */
@Data
@Accessors(chain = true)
public class VolunteerWebProject implements Serializable {

    private static final long serialVersionUID = 3117238048854323712L;
    /**
     * 项目ID
     */
    private String projectId;

    /**
     * 项目标题
     */
    private String title;

    /**
     * 该项目所属团体
     */
    private String organization;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 加入该项目的日期
     */
    private String joinDate;

    /**
     * 项目状态
     */
    private String projectStatus;

    /**
     * 岗位
     */
    private String job;

    /**
     * 服务时长
     */
    private String hours;
}
