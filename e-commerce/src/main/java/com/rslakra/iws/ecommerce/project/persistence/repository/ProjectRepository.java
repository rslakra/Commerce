package com.rslakra.iws.ecommerce.project.persistence.repository;

import com.devamatre.appsuite.spring.persistence.repository.BaseRepository;
import com.rslakra.iws.ecommerce.project.persistence.entity.Project;
import org.springframework.stereotype.Repository;

/**
 * @author Rohtash Lakra
 * @created 2/7/23 2:25 PM
 */
@Repository
public interface ProjectRepository extends BaseRepository<Project, Long> {

}
