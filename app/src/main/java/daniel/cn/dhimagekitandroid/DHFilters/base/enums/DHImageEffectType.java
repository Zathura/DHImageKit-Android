package daniel.cn.dhimagekitandroid.DHFilters.base.enums;

/**
 * Created by huanghongsen on 2018/1/5.
 */

public enum DHImageEffectType {

    None("None"),
    Normal("Normal"),
    Moon("Moon");

    private String name;

    private DHImageEffectType(String name) {
        this.name = name;
    }
}