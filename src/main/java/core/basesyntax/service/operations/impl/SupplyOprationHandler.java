package core.basesyntax.service.operations.impl;

import core.basesyntax.dao.FruitShopDao;
import core.basesyntax.dao.impl.FruitShopDaoImpl;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.operations.OperationHandler;

public class SupplyOprationHandler implements OperationHandler {
    @Override
    public void operate(FruitTransaction fruitTransaction) {
        FruitShopDao fruitShopStorage = new FruitShopDaoImpl();
        fruitShopStorage.supply(fruitTransaction.getFruit(),
                fruitTransaction.getQuantity());
    }
}
