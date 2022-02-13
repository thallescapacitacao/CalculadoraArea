package listagem;
import java.util.ArrayList;
import java.util.List;

import base.Area;

public class Areas {

    private List<Area> areas;

    public Areas() {
        areas = new ArrayList<Area>();
    }

    public void adicionar(Area area) {
        areas.add(area);
    }

    // TODO: retornar um novo objeto
    public List<Area> listar() {
        return areas;
    }

}
