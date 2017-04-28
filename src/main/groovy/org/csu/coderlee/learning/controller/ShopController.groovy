package org.csu.coderlee.learning.controller

import org.csu.coderlee.learning.dao.ShopRepository
import org.csu.coderlee.learning.domain.Shop
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by csucoderlee on 2017 04 28 下午3:23.
 */

@RestController
class ShopController {

    @Autowired
    ShopRepository shopRepository

    @RequestMapping(value = "/shop/{id}", method = RequestMethod.GET)
    Shop shop(@PathVariable Long id){
        return shopRepository.findById(id)
    }

}
