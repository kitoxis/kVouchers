package net.starfal.kvouchers.Functions;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryUtils {
    public static ItemStack createWall(Material material)
    {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        Component displayName = Component.text(" ");
        meta.displayName(displayName);
        item.setItemMeta(meta);
        return item;
    }

    public static Pane createRectangle(Pane.Priority priority, int x, int y, int length, int height, GuiItem item)
    {
        OutlinePane pane = new OutlinePane(x, y, length, height, priority);
        pane.addItem(item);
        pane.setRepeat(true);

        return pane;
    }
}
