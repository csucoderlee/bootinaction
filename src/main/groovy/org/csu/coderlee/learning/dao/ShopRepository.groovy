package org.csu.coderlee.learning.dao

import org.csu.coderlee.learning.domain.Shop
import org.springframework.data.jpa.repository.JpaRepository

import javax.annotation.Resource

/**
 * Created by csucoderlee on 2017 04 28 下午3:27.
 */
@Resource
interface ShopRepository extends JpaRepository<Shop, Long>{

    Shop findById(Long id)

}
