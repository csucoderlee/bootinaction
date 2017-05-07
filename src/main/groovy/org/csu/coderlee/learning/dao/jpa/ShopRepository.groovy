package org.csu.coderlee.learning.dao.jpa

import org.csu.coderlee.learning.domain.Shop
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by csucoderlee on 2017 04 28 下午3:27.
 */
@Repository
interface ShopRepository extends JpaRepository<Shop, Long>{

    Shop findById(Long id)

}
