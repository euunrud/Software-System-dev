package springidol.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springidol.Encore;
import springidol.TalentCompetition;

public class SpringIdolMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springIdol.xml");

		TalentCompetition competition = ctx.getBean("springIdol", TalentCompetition.class);

		competition.run();

		Encore encore = ctx.getBean("encore", Encore.class);
		encore.execute();

		ctx.close();
	}
}
