package com.xli9527.nineone.datagen;

import com.xli9527.nineone.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class NineOneModelGenerator extends FabricModelProvider {

    public NineOneModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.KNIFE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEN_ZI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEN_ZI_PIECE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NINEONE_LOGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARCH, Models.GENERATED);
    }
}