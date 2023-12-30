package space.gatt.terraminestom;

import com.dfsek.terra.api.Platform;
import com.dfsek.terra.api.addon.BaseAddon;
import com.dfsek.terra.api.block.state.BlockState;
import com.dfsek.terra.api.config.ConfigPack;
import com.dfsek.terra.api.config.PluginConfig;
import com.dfsek.terra.api.entity.EntityType;
import com.dfsek.terra.api.event.EventManager;
import com.dfsek.terra.api.handle.ItemHandle;
import com.dfsek.terra.api.handle.WorldHandle;
import com.dfsek.terra.api.profiler.Profiler;
import com.dfsek.terra.api.registry.CheckedRegistry;
import com.dfsek.terra.api.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class MinestomPlatform implements Platform {

	@Override
	public boolean reload() {
		return false;
	}

	@Override
	public @NotNull String platformName() {
		return "Minestom";
	}

	@Override
	public @NotNull WorldHandle getWorldHandle() {
		return new WorldHandle() {
			@Override
			public @NotNull BlockState createBlockState(@NotNull String s) {
				return null;
			}

			@Override
			public @NotNull BlockState air() {
				return null;
			}

			@Override
			public @NotNull EntityType getEntity(@NotNull String s) {
				return null;
			}
		};
	}

	@Override
	public @NotNull PluginConfig getTerraConfig() {
		return null;
	}

	@Override
	public @NotNull File getDataFolder() {
		return null;
	}

	@Override
	public @NotNull CheckedRegistry<ConfigPack> getConfigRegistry() {
		return null;
	}

	@Override
	public @NotNull Registry<BaseAddon> getAddons() {
		return null;
	}

	@Override
	public @NotNull ItemHandle getItemHandle() {
		return null;
	}

	@Override
	public @NotNull EventManager getEventManager() {
		return null;
	}

	@Override
	public @NotNull Profiler getProfiler() {
		return null;
	}

	@Override
	public void register(com.dfsek.tectonic.api.TypeRegistry typeRegistry) {

	}
}
