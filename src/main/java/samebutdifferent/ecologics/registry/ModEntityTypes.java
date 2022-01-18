package samebutdifferent.ecologics.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.ecologics.Ecologics;
import samebutdifferent.ecologics.entity.CoconutCrab;
import samebutdifferent.ecologics.entity.Squirrel;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Ecologics.MOD_ID);

    public static final RegistryObject<EntityType<CoconutCrab>> COCONUT_CRAB = ENTITY_TYPES.register("coconut_crab", () -> EntityType.Builder.of(CoconutCrab::new, MobCategory.CREATURE).sized(1.0F, 1.0F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "coconut_crab").toString()));
    public static final RegistryObject<EntityType<Squirrel>> SQUIRREL = ENTITY_TYPES.register("squirrel", () -> EntityType.Builder.of(Squirrel::new, MobCategory.CREATURE).sized(0.6F, 0.8F).clientTrackingRange(8).build(new ResourceLocation(Ecologics.MOD_ID, "squirrel").toString()));
}