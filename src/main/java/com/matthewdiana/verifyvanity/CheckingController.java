package com.matthewdiana.verifyvanity;

import com.matthewdiana.verifyvanity.checkers.StateChecker;
import com.matthewdiana.verifyvanity.checkers.states.NewYorkChecker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckingController {

    @RequestMapping("/check")
    public StateChecker check(@RequestParam(value="plateNum") String plateNum,
                              @RequestParam(value="state") String state) {
        return new NewYorkChecker(plateNum);
    }

}
