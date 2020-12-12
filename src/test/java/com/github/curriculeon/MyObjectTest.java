package com.github.curriculeon;

import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyObjectTest {

    private Person person;

    @Test
    public void regexTest() {
        new RegexTutorial().run();
    }

    @Test
    public void regexTest2() {
        String stringCompareTo = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple. " +
                "\nEdit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode. " +
                "\nThe side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns. " +
                "\nExplore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.";

        Pattern pattern = Pattern.compile("([A-Z]\\w+)");
        Matcher matcher = pattern.matcher(stringCompareTo);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
        }

    }
    
    @Test
    public void jsonTest() {
        Person leon = new Person(0L, "Leon", 27);
        Person bob = new Person(0L, "Bob", 28);
        Person chris = new Person(0L, "Chris", 29);
        Person noel = new Person(0L, "Noel", 27);
        Arrays
                .asList(leon, bob, chris, noel).forEach(person1 -> System.out.println(person.json()));

    }

    @Test
    public void licenseTest() {
        LicenseBuilder license = new LicenseBuilder()
                .setEndorsement('C')
                .setBirthDate(new Date())
                .setLastName("Hunter")
                .setExpiresDate(new Date());
        System.out.println(license);
    }
}