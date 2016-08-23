package com.marcelustrojahn

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * @author Marcelus Trojahn (www.marcelustrojahn.com)
 * Created on 2016-08-23
 *
 */
@Controller
class MyController {

    @GetMapping(['/', '/index.html'])
    def index(Model model) {
        'index'
    }

    @GetMapping('/frag1')
    def frag1(Model model) {
        model.addAttribute("content", "hello")
        "fragments/frag1 :: content"
    }

    @GetMapping('/frag2')
    def frag2(Model model) {
        model.addAttribute("content", "world")
        "fragments/frag2 :: content"
    }
}
