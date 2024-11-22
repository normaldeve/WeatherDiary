package zerobase.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;
import zerobase.weather.repository.JpaMemoRepository;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
public class JpaMemoRepositoryTest {
    @Autowired
    JpaMemoRepository jpaMemoRepository;
    @Test
    void insertMemo() {
        //given
        Memo memo = new Memo(10, "this is JpaMemeRepository Test Code");
        //when
        jpaMemoRepository.save(memo);
        //then
        List<Memo> memoList = jpaMemoRepository.findAll();
        Assertions.assertTrue(memoList.size() > 0);

      }

      @Test
      void findByIdTest() {
          //given
          Memo memo = new Memo(11, "jpa");
          //when
          Memo saveMemo = jpaMemoRepository.save(memo);
          //then
          Optional<Memo> result = jpaMemoRepository.findById(saveMemo.getId());
          Assertions.assertEquals(result.get().getText(), "jpa");
      }
}
