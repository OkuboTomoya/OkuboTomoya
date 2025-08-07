package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;

public interface HouseRepository extends JpaRepository<House, Integer> {

	// 名前による部分一致検索
	public Page<House> findByNameLike(String keyword, Pageable pageable);

	// 名前または住所による部分一致検索
	public Page<House> findByNameLikeOrAddressLike(String nameKeyword, String addressKeyword, Pageable pageable);

	// 名前または住所による部分一致検索（作成日時の降順）
	public Page<House> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword, String addressKeyword,
			Pageable pageable);

	// 名前または住所による部分一致検索（価格の昇順）
	public Page<House> findByNameLikeOrAddressLikeOrderByPriceAsc(String nameKeyword, String addressKeyword,
			Pageable pageable);

	// 住所による検索（作成日時の降順）
	public Page<House> findByAddressLikeOrderByCreatedAtDesc(String area, Pageable pageable);

	// 住所による検索（価格の昇順）
	public Page<House> findByAddressLikeOrderByPriceAsc(String area, Pageable pageable);

	// 価格以下の物件の検索（作成日時の降順）
	public Page<House> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);

	// 価格以下の物件の検索（価格の昇順）
	public Page<House> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable);

	// 作成日時の降順で全件取得
	public Page<House> findAllByOrderByCreatedAtDesc(Pageable pageable);

	// 価格の昇順で全件取得
	public Page<House> findAllByOrderByPriceAsc(Pageable pageable);

	// 作成日時の降順でトップ10件取得
	public List<House> findTop10ByOrderByCreatedAtDesc();
	
	// 住所による部分一致検索
	public Page<House> findByAddressLike(String area, Pageable pageable);
	
	// 価格以下の物件の検索
	public Page<House> findByPriceLessThanEqual(Integer price, Pageable pageable);

}
