package com.rslakra.iws.ecommerce.project.persistence.entity;

import com.devamatre.appsuite.spring.persistence.entity.NamedEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Rohtash Lakra
 * @created 7/24/23 12:27 PM
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "projects")
public class Project extends NamedEntity<Long> {

    @Transient
    private List<Feature> features;

}
