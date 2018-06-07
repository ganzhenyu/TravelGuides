package TravelGuide.entity;

/**
 * Created by Administrator on 2018/6/4.
 */
public class Function {
    private int id;
    private String name;
    private String code;
    private boolean isMenuItem;
    private String menuLogo;
    private String menuEntry;
    private int parentId;

    public Function(int id, String name, String code, boolean isMenuItem, String menuLogo, String menuEntry, int parentId) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.isMenuItem = isMenuItem;
        this.menuLogo = menuLogo;
        this.menuEntry = menuEntry;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isMenuItem() {
        return isMenuItem;
    }

    public void setMenuItem(boolean menuItem) {
        isMenuItem = menuItem;
    }

    public String getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(String menuLogo) {
        this.menuLogo = menuLogo;
    }

    public String getMenuEntry() {
        return menuEntry;
    }

    public void setMenuEntry(String menuEntry) {
        this.menuEntry = menuEntry;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
