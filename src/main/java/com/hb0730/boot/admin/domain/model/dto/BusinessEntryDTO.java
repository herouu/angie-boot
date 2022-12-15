package com.hb0730.boot.admin.domain.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author bing_huang
 * @since 3.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class BusinessEntryDTO extends BaseDTO {
    private Long id;
    private Long parentId;
}
