import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ItemLayer")
public final class ItemLayer
{
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -626858235
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lee;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1402854643
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -921383543
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lee;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lee;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 1345007712428644829L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -720251669
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
