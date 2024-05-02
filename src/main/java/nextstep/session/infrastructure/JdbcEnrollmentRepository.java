package nextstep.session.infrastructure;

import nextstep.session.domain.*;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("EnrollmentRepository")
public class JdbcEnrollmentRepository implements ImageInfoRepository {
	@Override
	public int save(ImageInfo imageInfo) {
		return 0;
	}

	@Override
	public Optional<ImageInfo> findById(long id) {
		return Optional.empty();
	}

	@Override
	public int update(ImageInfo imageInfo) {
		return 0;
	}

	@Override
	public int deleteById(long id) {
		return 0;
	}
	//	private JdbcOperations jdbcTemplate;
//
//	public JdbcEnrollmentRepository(JdbcOperations jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	@Override
//	public int save(Enrollment enrollment) {
//		String sql = "insert into enrollment (image_size, width, height, image_type) values(?, ?, ?, ?)";
//		return jdbcTemplate.update(sql, imageInfo.getImageSize(), imageInfo.getImageWidth(), imageInfo.getImageHeight(), imageInfo.getImageType());
//	}
//
//	@Override
//	public Optional<ImageInfo> findById(long id) {
//		String sql = "select id, image_size, width, height, image_type from image_info where id = ?";
//		RowMapper<ImageInfo> rowMapper = (rs, rowNum) -> new ImageInfo(
//				rs.getLong(1),
//				new ImageSize(rs.getInt(2)),
//				new ImageReSolution(rs.getInt(3), rs.getInt(4)),
//				ImageType.getImageType(rs.getString(5)));
//		return Optional.ofNullable(jdbcTemplate.queryForObject(sql, rowMapper, id));
//	}
//
//	@Override
//	public int update(ImageInfo imageInfo) {
//		String sql = "update image_info set image_size = ?, width = ?, height = ?, image_type = ? where id = ?";
//		return jdbcTemplate.update(sql, imageInfo.getImageSize(), imageInfo.getImageWidth(), imageInfo.getImageHeight(), imageInfo.getImageType(), imageInfo.getId());
//	}
//
//	@Override
//	public int deleteById(long id) {
//		String sql = "delete from image_info where id = ?";
//		return jdbcTemplate.update(sql, id);
//	}

}