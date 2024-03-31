package com.rslakra.iws.ecommerce.product.persistence.repository;

import com.devamatre.appsuite.spring.persistence.repository.BaseRepository;
import com.rslakra.iws.ecommerce.product.persistence.entity.Product;
import org.springframework.stereotype.Repository;

/**
 * @author Rohtash Lakra
 * @created 2/7/23 2:25 PM
 */
@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {

}
