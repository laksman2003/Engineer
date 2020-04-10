package com.test.testing.automationengineer;

import com.test.automation.AutomationEngineer;
import com.test.automation.TestFramework;
import com.test.engineer.SkillSet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TestAutoEngineer {

        @Test
        public void testsayHello() {

            AutomationEngineer autoeng = new AutomationEngineer("John",
                    "Peter", TestFramework.Selenium);
            List<SkillSet> skillsets = Arrays.asList(new SkillSet[]{SkillSet.DEVOPS, SkillSet.JAVA});
            autoeng.setSkillSet(skillsets);

            String expectedMessage = "Hello! My name is John Peter and my skills are: DEVOPS, JAVA" + "\n"+
                                      "My favorite test framework is Selenium";

            String greetingMessage = autoeng.sayHello();
            System.out.println(greetingMessage);
            System.out.println(expectedMessage);
            Assert.assertEquals(greetingMessage, expectedMessage);
        }

        @Test
        public void testcompareStrings()
        {
            AutomationEngineer autoeng = new AutomationEngineer("John",
                    "Peter", TestFramework.Selenium);

            boolean isCorrect = autoeng.compareStrings("Hello ", "HELLO");
            Assert.assertEquals(isCorrect, true);
        }

        @Test
        public void testgetOrdinalNumberofDay()
        {
            AutomationEngineer autoeng = new AutomationEngineer("John",
                    "Peter", TestFramework.Selenium);

            Assert.assertEquals(1,autoeng.getDayOrdinalNumber("Monday"));
            Assert.assertEquals(-1,autoeng.getDayOrdinalNumber("XXXXX"));

        }

        @Test
        public void testCompareDates()
        {
            AutomationEngineer autoeng = new AutomationEngineer("John",
                    "Peter", TestFramework.Selenium);

            LocalDate d1 =  LocalDate.parse("2020-04-10");
            LocalDate d2 = LocalDate.parse("2020-04-11");
            String result = autoeng.compareDates(d1, d2);
            Assert.assertEquals("Date "+result, "Date 2020/04/11 is greater than 2020/04/10");

        }


    }
