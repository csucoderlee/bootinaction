package org.csu.coderlee.learning.controller

import org.csu.coderlee.learning.dao.jpa.ShopRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by csucoderlee on 2017 04 28 下午3:59.
 */

@Controller
class ViewController {

    @Autowired
    ShopRepository shopRepository

    @RequestMapping(value = "/shopview/{id}", method = RequestMethod.GET)
    String view(@PathVariable Long id, Model model){
        String shopName = shopRepository.findById(id).getShopName()
        model.addAttribute("name", shopName)
        return "view"
    }

}
