package com.rslakra.iws.ecommerce.task.persistence.entity;

import com.devamatre.appsuite.spring.persistence.entity.NamedEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.Transient;

/**
 * @author Rohtash Lakra
 * @created 7/20/23 12:17 PM
 */
@Getter
@Setter
@NoArgsConstructor
//@Entity
//@Table(name = "task_groups")
public class TaskGroup extends NamedEntity<Long> {

    @Transient
    private List<Task> tasks;
}
