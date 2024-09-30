package com.rslakra.iws.ecommerce.marketing.filter;

import com.rslakra.appsuite.spring.filter.AbstractFilter;
import com.rslakra.iws.ecommerce.marketing.persistence.entity.Marketing;

import java.util.Map;

/**
 * @author Rohtash Lakra
 * @created 2/8/23 1:06 PM
 */
public final class MarketingFilter extends AbstractFilter<Marketing> {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String USER_ID = "userId";

    /**
     * @param allParams
     */
    public MarketingFilter(Map<String, Object> allParams) {
        super(allParams);
    }

}
