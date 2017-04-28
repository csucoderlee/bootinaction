package org.csu.coderlee.learning.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by csucoderlee on 2017 04 28 上午11:29.
 */
class Shop {

    @Id
    @GeneratedValue
    Long id
    String shopName
}
