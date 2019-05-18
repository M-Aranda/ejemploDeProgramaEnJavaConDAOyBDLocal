/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Cheloz
 */
public class TMModelNotas implements TableModel {

    private List<Nota> notas;

    public TMModelNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public int getRowCount() {
        return notas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "id";
            case 1:
                return "Valor";
            case 2:
                return "Porcentaje";
            case 3:
                return "Asignatura";
            default:

                return null;
        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nota n = notas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return n.getId();
            case 1:
                return n.getValor();
            case 2:
                return n.getPorcentaje();
            case 3:
                return n.getAsig().getNombre();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        //
    }

}
