package top.mcmtr.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.registry.ItemRegistryObject;
import top.mcmtr.core.data.CatenaryType;
import top.mcmtr.mod.items.ItemCatenaryConnector;
import top.mcmtr.mod.items.ItemModelChangeStick;
import top.mcmtr.mod.items.ItemRigidCatenaryConnector;

public class Items {
    static {
        CATENARY_CONNECTOR = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "catenary_connector"), itemSettings -> new Item(new ItemCatenaryConnector(itemSettings.maxCount(1), true, CatenaryType.CATENARY)), CreativeModeTabs.EXTERNAL);
        ELECTRIC_CONNECTOR = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "electric_connector"), itemSettings -> new Item(new ItemCatenaryConnector(itemSettings.maxCount(1), true, CatenaryType.ELECTRIC)), CreativeModeTabs.EXTERNAL);
        RIGID_SOFT_CATENARY_CONNECTOR = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rigid_soft_catenary_connector"), itemSettings -> new Item(new ItemCatenaryConnector(itemSettings.maxCount(1), true, CatenaryType.RIGID_SOFT_CATENARY)), CreativeModeTabs.EXTERNAL);
        RIGID_CATENARY_CONNECTOR = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rigid_catenary_connector"), itemSettings -> new Item(new ItemRigidCatenaryConnector(itemSettings.maxCount(1), true)), CreativeModeTabs.EXTERNAL);
        CATENARY_REMOVER = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "catenary_remover"), itemSettings -> new Item(new ItemCatenaryConnector(itemSettings.maxCount(1), false, CatenaryType.NONE)), CreativeModeTabs.EXTERNAL);
        RIGID_CATENARY_REMOVER = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rigid_catenary_remover"), itemSettings -> new Item(new ItemRigidCatenaryConnector(itemSettings.maxCount(1), false)), CreativeModeTabs.EXTERNAL);
        MODEL_CHANGE_STICK = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "model_change_stick"), itemSettings -> new Item(new ItemModelChangeStick(itemSettings.maxCount(1))), CreativeModeTabs.STATION);
    }

    public static final ItemRegistryObject CATENARY_CONNECTOR;
    public static final ItemRegistryObject ELECTRIC_CONNECTOR;
    public static final ItemRegistryObject RIGID_SOFT_CATENARY_CONNECTOR;
    public static final ItemRegistryObject RIGID_CATENARY_CONNECTOR;
    public static final ItemRegistryObject CATENARY_REMOVER;
    public static final ItemRegistryObject RIGID_CATENARY_REMOVER;
    public static final ItemRegistryObject MODEL_CHANGE_STICK;

    public static void init() {
        Init.MSD_LOGGER.info("Registering MTR Station Decoration items");
    }
}