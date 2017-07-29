package com.teammaker.controller.dto;

import com.teammaker.model.entities.Project;
import com.teammaker.model.entities.Technology;
import org.hibernate.validator.constraints.Length;

/**
 * Created by Ярослав on 29.07.2017.
 */
public class TechnologyDto {
    @Length(min = 1, max = 100)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TechnologyDto of(Technology technology) {
        TechnologyDto technologyDto = new TechnologyDto();
        technologyDto.setName(technology.getName());
        return technologyDto;
    }
}
