/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gameduoihinhbatchu;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author tranv
 */
public class ImageRenderer extends DefaultTableCellRenderer{
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Lấy ImageIcon từ giá trị trong ô cột ảnh
        ImageIcon icon = (ImageIcon) value;
        // Tạo JLabel để hiển thị ảnh
        
        
        JLabel label = new JLabel(icon);
        // Trả về JLabel làm nội dung của ô
        return label;
    }
}
