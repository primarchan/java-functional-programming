package part10.service;

import part10.model.Price;

@FunctionalInterface
public interface PriceProcessor {

    Price process(Price price);

    default PriceProcessor andThen(PriceProcessor next) {
        return price -> next.process(process(price));
    }

}
