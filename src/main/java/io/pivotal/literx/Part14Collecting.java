package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Part14Collecting {

//========================================================================================

    // TODO Concat all strings included in Flux
    Mono<String> concatStrings(Flux<String> flux) {
        return null;
    }

//========================================================================================

    // TODO Singal true if any of user in flux is SKYLER
    Mono<Boolean> includesSkyler(Flux<User> flux) {
        return null;
    }

//========================================================================================

    // TODO Singal true if none of user in flux is SKYLER
    Mono<Boolean> doesNotIncludeSkyler(Flux<User> flux) {
        return null;
    }

}
