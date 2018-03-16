package cc.hyperium.handlers.handlers;

import cc.hyperium.config.ConfigOpt;

/**
 * Created by mitchellkatz on 3/13/18. Designed for production use on Sk1er.club
 */
public class OtherConfigOptions {
    @ConfigOpt
    public double headScaleFactor = 2.0;
    @ConfigOpt
    public boolean hideNameTags = false;
    @ConfigOpt
    public int renderNameDistance = 64;
    @ConfigOpt
    public boolean shadeNameTags = true;

}
