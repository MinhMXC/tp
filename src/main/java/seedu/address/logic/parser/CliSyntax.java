package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_NOTE = new Prefix("r/");
    // Tag prefixes
    public static final Prefix PREFIX_DESC = new Prefix("d/");
    public static final Prefix PREFIX_COLOR = new Prefix("c/");
    // Relationship prefixes
    public static final Prefix PREFIX_PART_1 = new Prefix("p1/");
    public static final Prefix PREFIX_PART_2 = new Prefix("p2/");
}
