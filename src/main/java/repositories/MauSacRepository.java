package repositories;

import entities.MauSac;

import java.util.ArrayList;
import java.util.List;

public class MauSacRepository {
    private List<MauSac> listMS = new ArrayList<>();

    public MauSacRepository()
    {
        this.listMS.add(new MauSac(1, "PH1", "Red", 1));
        this.listMS.add(new MauSac(2, "PH2", "Green", 1));
        this.listMS.add(new MauSac(3, "PH3", "Black", 0));
    }

    public List<MauSac> getListMS() {
        return listMS;
    }

    public void setListMS(List<MauSac> listMS) {
        this.listMS = listMS;
    }

    public void create(MauSac ms)
    {
        this.listMS.add(ms);
    }

    public void update(MauSac newValue)
    {
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac oldValue = this.listMS.get(i);
            if (oldValue.getId() == newValue.getId()) {
                this.listMS.set(i, newValue);
                return ;
            }
        }
    }

    public void delete(MauSac newValue)
    {
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac oldValue = this.listMS.get(i);
            if (oldValue.getId() == newValue.getId()) {
                this.listMS.remove(i);
                return ;
            }
        }
    }

    public MauSac findById(int id)
    {
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac value = this.listMS.get(i);
            if (value.getId() == id) {
                return value;
            }
        }

        return null;
    }
}
