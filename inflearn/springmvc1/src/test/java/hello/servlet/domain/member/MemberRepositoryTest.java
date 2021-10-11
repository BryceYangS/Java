package hello.servlet.domain.member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {
	MemberRepository memberRepository = MemberRepository.getInstance();

	@AfterEach
	void afterEach() {
		memberRepository.clearStore();
	}

	@Test
	void save() throws Exception {
		// given
		Member hello = new Member("hello", 20);

		// when
		Member save = memberRepository.save(hello);

		// then
		Member findMember = memberRepository.findById(save.getId());
		assertThat(findMember).isEqualTo(save);
	}

	@Test
	public void findAll() throws Exception {
		// given
		Member mem1 = new Member("mem1", 20);
		Member mem2 = new Member("mem2", 30);

		memberRepository.save(mem1);
		memberRepository.save(mem2);

		// when
		List<Member> all = memberRepository.findAll();

		// then
		assertThat(all.size()).isEqualTo(2);
		assertThat(all).contains(mem1, mem2);
	}
}